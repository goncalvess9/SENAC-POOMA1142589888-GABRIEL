package centsPulse;

public class InformacaoMercado {
    private String noticia;
    private String data;

    public InformacaoMercado(String noticia, String data) {
        this.noticia = noticia;
        this.data = data;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

