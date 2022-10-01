/** Program to create a web crawler that will scan through webpages from a starting
 * URL until it finds the string "computer programming".
 * 
 * @author Scott M.
 * WebCrawler.java
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.net.URL;

public class WebCrawler {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String url, phrase;
        
        System.out.print("Enter a starting URL: ");
        url = kb.nextLine();
        System.out.print("Enter a phrase to search for: ");
        phrase = kb.nextLine();
        crawler(url, phrase);
    }
    
    /** Method to run a web crawler that searches for a specific phrase (not case
     * sensitive).
     * 
     * @params Starting URL, phrase
     */
    public static void crawler(String startUrl, String phrase) {
        ArrayList<String> urlsToVisit = new ArrayList<>();
        ArrayList<String> urlsVisited = new ArrayList<>();
        urlsToVisit.add(startUrl);
        
        while (!urlsToVisit.isEmpty()) {
            String url = urlsToVisit.get(0);
            try {
                URL web = new URL(url);
                Scanner input = new Scanner(web.openStream());
                System.out.println("Crawl " + url);
                urlsVisited.add(url);
                urlsToVisit.remove(0);
                while (input.hasNext()) {
                    String line = input.nextLine();
                    int current = 0;
                    if (line.toUpperCase().contains(phrase.toUpperCase())) {
                        System.out.println("phrase " + phrase + " found at " + url);
                        return;
                    }
                    current = line.indexOf("http:", current);
                    while (current > 0) {
                        int endIndex = line.indexOf("\"", current);
                        if (endIndex > 0 && !urlsVisited.contains(line.substring(current, endIndex)) && !urlsToVisit.contains(line.substring(current, endIndex))) {
                            urlsToVisit.add(line.substring(current, endIndex));
                            current = line.indexOf("http:", endIndex);
                        }
                        else {
                            current = -1;
                        }
                    }
                }
            }
            catch (java.net.MalformedURLException ex) {
                System.out.println("URL " + url + " is not formatted correctly");
                urlsToVisit.remove(0);
            }
            catch (java.io.IOException ex) {
                System.out.println("URL " + url + " does not exist");
                urlsToVisit.remove(0);
            }
            catch (Exception ex) {
                System.out.println("Something went wrong with URL " + url);
                urlsToVisit.remove(0);
            }
        }
        
        System.out.println("Out of URLs");
    }
}