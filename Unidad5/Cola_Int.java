package Unidad5;

public class Cola_Int {
	private Nodo_int entrada;
    private Nodo_int salida;	

    public Cola_Int() {
        entrada = null;
        salida = null;
    }

    void encolar(int d) {
    	Nodo_int aux = new Nodo_int(d);
        if (entrada != null)
            entrada.setNext(aux);
        entrada = aux;
        if (salida == null)
            salida = entrada;
    }
    int mostrar() throws Exception {
        if (salida == null)
            throw new Exception("Cola vacia");

        int res = salida.getDato();
        return res;
    }
    

    int desencolar() throws Exception {
        if (salida == null)
            throw new Exception("Cola vacia");

        int res = salida.getDato();
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
