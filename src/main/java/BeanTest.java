public class BeanTest {
    public static void main(String[] args) {
        Album thriller = new Album("Michael Jackson", "Thriller", 1982, 66.00, "Pop, Rock, R&B");
        Album backInBlack = new Album("AC/DC", "Back in Black", 1980, 50.00, "Hard Rock");

        ArrayList<Album> albums = new ArrayList<>(List.of(thriller, backInBlack));
        for (Album album : albums){
            System.out.println(album.getName() + " sold " + album.getSales() + " million copies");
        }

        Author neilGaiman = new Author("Neil Gaiman");
        Author yoda = new Author("Yoda");
        Author zhuangzi = new Author("Zhuangzi");

        ArrayList<Author> authors = new ArrayList<>(List.of(neilGaiman, yoda, zhuangzi));

        Quote neilGaimanQuote1 = new Quote("I hope you will have a wonderful year, that you'll dream dangerously and outrageously, that you'll make something that didn't exist before you made it", neilGaiman);
        Quote neilGaimanQuote2 = new Quote("I hope that in this year to come, you make mistakes. Because if you are making mistakes...you're Doing Something.", neilGaiman);
        Quote yodaQuote = new Quote("Do. Or do not. There is no try.", yoda);
        Quote zhuangziQuote = new Quote("Within yourself, no fixed positions.  Things as they take shape disclose themselves.  Moving, be like water,  Still, be like a mirror,  Respond like an echo", zhuangzi);

        ArrayList<Quote> quotes = new ArrayList<>(List.of(neilGaimanQuote1, neilGaimanQuote2, yodaQuote, zhuangziQuote));

        neilGaiman.setQuotes(new ArrayList<>(List.of(neilGaimanQuote1, neilGaimanQuote2)));
        yoda.setQuotes(new ArrayList<>(List.of(yodaQuote)));
        zhuangzi.setQuotes(new ArrayList<>(List.of(zhuangziQuote)));

        for (Quote quote : quotes) {
            System.out.println(quote.getAuthor().getName() + " said: " + quote.getContent());
        }

        for (Author author: authors){
            System.out.println(author.getName() + " said: ");
            for (Quote quote : author.getQuotes()){
                System.out.println(quote.getContent());
            }
        }


//        System.out.println(neilGaiman.getName() + " said: ");
//        for (Quote quote : neilGaiman.getQuotes()){
//            System.out.println(quote.getContent());
//        }

    }
}
