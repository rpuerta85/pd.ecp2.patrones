package es.upm.miw.pd.state.connection;

public abstract class Estado {
    protected static final String MSG_ACCION_NOPERMITIDA="Acción no permitida... ";
    
    //CERRADO, PARADO, PREPARADO, ESPERANDO;
    public abstract void abrir(Conexion conexion);
    public abstract void cerrar(Conexion conexion);
    public abstract void parar(Conexion conexion);
    public abstract void iniciar(Conexion conexion);
    public abstract void enviar(Conexion conexion,String msg);
    public abstract void recibir(Conexion conexion,int respuesta);

    public String toString(){
       return "Estado "+this.getClass().getSimpleName();
    }

}
