class DownloaderProxy implements Downloader {

    private DownloaderReal downloaderReal;
    private String usuario;

    public DownloaderProxy(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void download(String arquivo) {

        if (temPermissao()) {

            if (downloaderReal == null) {
                downloaderReal = new DownloaderReal(); // Lazy loading
            }

            System.out.println("Log: usuário " + usuario + " iniciou download");

            downloaderReal.download(arquivo);

        } else {
            System.out.println("Acesso negado para usuário: " + usuario);
        }
    }

    private boolean temPermissao() {
        return usuario.equals("admin");
    }
}