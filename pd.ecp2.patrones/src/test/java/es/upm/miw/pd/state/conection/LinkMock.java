package es.upm.miw.pd.state.conection;

import es.upm.miw.pd.state.connection.Cerrado;
import es.upm.miw.pd.state.connection.Conexion;
import es.upm.miw.pd.state.connection.Link;

 final class LinkMock extends Conexion implements Link {

    private String msg;

    private int respuesta;

    public LinkMock() {
        this.estado = new Cerrado();
    }


    public String getMsg() {
        return msg;
    }

    public int getRespuesta() {
        return respuesta;
    }

    @Override
    public void enviar(String msg) {
        this.msg = msg;
        this.estado.enviar(this, msg);
    }


    @Override
    public void recibir(int respuesta) {
        this.respuesta = respuesta;
        this.estado.recibir(this,respuesta);
    }

}
