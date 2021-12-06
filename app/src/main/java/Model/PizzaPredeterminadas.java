package Model;

public class PizzaPredeterminadas {

    private String[] PizzaPredeterminada= {"Pizza Napolitana","Pizza Predilecta","Pizza Vegana","Pizza Selecta"};
    private int[] precioPredeterminado={12500,13800,15600,18600};
    private String[] ingredientes={"Tocino","Extra Queso","Champiñon","Salame","Albahaca"};
    private int[] precioIngrediente={350,500,250,300,450};

    public String[] getPizzaPredeterminada() {
        return PizzaPredeterminada;
    }

    public void setPizzaPredeterminada(String[] pizzaPredeterminada) {
        PizzaPredeterminada = pizzaPredeterminada;
    }

    public int[] getPrecioPredeterminado() {
        return precioPredeterminado;
    }

    public void setPrecioPredeterminado(int[] precioPredeterminado) {
        this.precioPredeterminado = precioPredeterminado;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int[] getPrecioIngrediente() {
        return precioIngrediente;
    }

    public void setPrecioIngrediente(int[] precioIngrediente) {
        this.precioIngrediente = precioIngrediente;
    }

    public int precioFinal(int precioPizza,int precioIngrediente){


        return precioPizza + precioIngrediente;
    }
}
