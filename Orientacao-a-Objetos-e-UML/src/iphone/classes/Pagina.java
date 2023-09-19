package iphone.classes;

public class Pagina {
    private String url;
    private String ip;

    public Pagina(String url, String ip) {
        this.url = url;
        this.ip = ip;
    }

    public String getUrl() {
        return url;
    }

    public String getIp() {
        return ip;
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "url='" + url + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
