package es.upm.miw.pd.state.connection;

public class Conexion {
    private Estado estado;

    private Link link;

    private String msg;

    public Conexion() {
        this.estado = new Cerrado();
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void abrir() {
        this.estado.abrir(this);
    }

    public void cerrar() {
        this.estado.cerrar(this);
    }

    public void parar() {
        this.estado.parar(this);
    }

    public void iniciar() {
        this.estado.iniciar(this);
    }

    public void enviar(String msg) {
        this.estado.enviar(this, msg);
    }

    public void recibir(int respuesta) {
        this.estado.recibir(this,respuesta);
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
