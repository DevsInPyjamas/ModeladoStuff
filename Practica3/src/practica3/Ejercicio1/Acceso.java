package practica3.Ejercicio1;

import java.util.Date;

public class Acceso {
    private Date fecha;
    private TipoAcceso tipo;
    private Expediente accedido;
    private Profesional usuario;

    public Acceso(Profesional profesional, Expediente expediente, TipoAcceso tipo, Date fecha) {
        this.accedido = expediente;
        this.usuario = profesional;
        profesional.addAcceso(this);
        expediente.addAcceso(this);
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public void removeAcceso() {
        accedido.removeAcceso(this);
        usuario.removeAcceso(this);
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTipo(TipoAcceso tipo) {
        this.tipo = tipo;
    }

    public void setAccedido(Expediente accedido) {
        this.accedido = accedido;
    }

    public void setUsuario(Profesional usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public TipoAcceso getTipo() {
        return tipo;
    }

    public Expediente getAccedido() {
        return accedido;
    }

    public Profesional getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Acceso{" +
                "fecha=" + fecha +
                ", tipo=" + tipo +
                '}';
    }
}
