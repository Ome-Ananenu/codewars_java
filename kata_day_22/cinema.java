public class Movie {
    
    public static int movie(int card, int ticket, double perc) {
        int count = 0;
        double totalB = card;
        
        while (ticket * count <= Math.ceil(totalB)) totalB += ticket * Math.pow(perc, ++count);

        return count;
    }
}

public class Movie {

    public static int movie(int card, int ticket, double perc) {
        double systemA = 0, systemB = card, tempTicket = ticket;
        int numberOfVisits = 0;
        do {
            systemA += ticket;
            tempTicket *= perc;
            systemB += tempTicket;
            numberOfVisits++;
        } while (systemA <= Math.ceil(systemB));

        return numberOfVisits;
    