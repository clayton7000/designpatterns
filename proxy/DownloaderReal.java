class DownloaderReal implements Downloader {

    @Override
    public void download(String arquivo) {
        System.out.println("Baixando arquivo: " + arquivo);
    }
}