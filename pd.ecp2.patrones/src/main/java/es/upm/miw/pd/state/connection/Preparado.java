package es.upm.miw.pd.state.connection;

public class Preparado extends Estado {

    @Override
    public void abrir(Conexion conexion) {
    }

    @Override
    public void cerrar(Conexion conexion) {
        conexion.setEstado(new Cerrado());
     }

    @Override
    public void parar(Conexion conexion) {
        conexion.setEstado(new Parado());
    }

    @Override
    public void iniciar(Conexion conexion) {
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        conexion.setEstado(new Esperando());
        conexion.setMsg(msg);
      }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        throw new UnsupportedOperationException(MSG_ACCION_NOPERMITIDA);
    }

}
