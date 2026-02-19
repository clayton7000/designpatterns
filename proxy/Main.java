public class Main {

    public static void main(String[] args) {

        Downloader downloader1 = new DownloaderProxy("admin");
        downloader1.download("relatorio.pdf");

        System.out.println("-----");

        Downloader downloader2 = new DownloaderProxy("visitante");
        downloader2.download("dados.csv");
    }
}