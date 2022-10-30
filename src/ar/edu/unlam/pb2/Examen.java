package ar.edu.unlam.pb2;

public abstract class Examen implements Aprobable {
    private String fecha;

    public Examen(String fecha) {
        this.fecha = fecha;
    }

}
