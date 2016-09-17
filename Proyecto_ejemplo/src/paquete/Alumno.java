package paquete;


public class Alumno extends Persona
{
    private int n_matricula;

    public Alumno(int i, String string, int n_mat)
    {
        super(i, string);
        this.n_matricula = n_mat;
    }

    public int getN_matricula()
    {
        return n_matricula;
    }

    public boolean metodo()
    {
        //Se cambio para que retorne true.
        return true;
}
}
