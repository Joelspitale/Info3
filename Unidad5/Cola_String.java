package Unidad5;

public class Cola_String {
	private Nodo_String entrada;
    private Nodo_String salida;	

    public Cola_String() {
        entrada = null;
        salida = null;
    }

    void encolar(String d) {
    	Nodo_String aux = new Nodo_String(d);
        if (entrada != null)
            entrada.setNext(aux);
        entrada = aux;
        if (salida == null)
            salida = entrada;
    }
    String mostrar() throws Exception {
        if (salida == null)
            throw new Exception("Cola vacia");

        String res = salida.getDato();
        return res;
    }
    

    String desencolar() throws Exception {
        if (salida == null)
            throw new Exception("Cola vacia");

        String res = salida.getDato();
        salida = salida.getNext();
        if (salida == null)
            entrada = null;
        return res;
    }

    boolean esVacia() {
        return salida == null;
    }

    void vaciar() {
        entrada = null;
        salida = null;
    }

}
