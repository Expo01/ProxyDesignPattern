public class Browser{
    public static void main(String[] args) {
        WebPageProxy webPageProxy = new WebPageProxy();
        try {
            webPageProxy.renderPage("www.youtube.com");
        } catch (Exception e){
            System.out.println("Exception occurred" + e.getMessage());
            e.printStackTrace();
        }
    }
}