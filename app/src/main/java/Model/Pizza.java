package Model;

public class Pizza {
    private String id;
    private String nombre;
    private String[] PizzaPredeterminada= {"Pizza Napolitana","Pizza Predilecta","Pizza Vegana","Pizza Selecta"};
    private String precio;
    private int[] precioPredeterminado={12500,13800,15600,18600};
    private String[] ingredientes={"Tocino","Extra Queso","Champiñon","Salame","Albahaca"};
    private int[] precioIngrediente={350,500,250,300,450};
    private String localizacion;

    public Pizza() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }


    @Override
    public String toString() {
        return nombre+" "+precio+" "+localizacion;
    }

    public int precioFinal(int precioPizza,int precioIngrediente){


        return precioPizza + precioIngrediente;
    }
}
