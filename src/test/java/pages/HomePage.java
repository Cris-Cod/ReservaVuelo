package pages;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HomePage {

    vueloReserva vuelo;


    @Step
    public void paginaInicio(){
        vuelo.open();
        vuelo.cerrarToopLip();
    }

    @Step
    public void lugarOrigenYDestino(){
        vuelo.origen();
        vuelo.destino();
    }

    @Step
    public void reservaFechas(){
        vuelo.fechas();
    }

    @Step
    public void buscarVuelo(){
        vuelo.btnBuscar();
    }

    @Step
    public void ordenMenorDuracion(){


        String hora = "Horarios";
        String precio = "Precio";

        Assert.assertEquals("El elemento no se encuentra en la pagina",hora,vuelo.horario());
        Assert.assertEquals("El elemento no se encuentra en la pagina",precio,vuelo.precio());


        vuelo.duracion();
    }

    @Step
    public void compraVuelo(){
        vuelo.btnComprar();
    }
}
