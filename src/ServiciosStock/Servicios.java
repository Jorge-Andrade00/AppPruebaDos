/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosStock;

/**
 *
 * @author jofas
 */
public class Servicios {
    public  Servicios(){
    }

    public void actualizaSctock(int cantidadSalida, java.lang.String sku, int stock) {
        webservice.NewWebServiceStock service = new webservice.NewWebServiceStock();
        webservice.WebServiceStock port = service.getWebServiceStockPort();
        port.actualizaSctock(cantidadSalida, sku, stock);
    }

    public void guardarRegistro(webservice.SalidaProducto sp) {
        webservice.NewWebServiceStock service = new webservice.NewWebServiceStock();
        webservice.WebServiceStock port = service.getWebServiceStockPort();
        port.guardarRegistro(sp);
    }

    public java.util.List<webservice.Stock> listaProducto(java.lang.String sku) {
        webservice.NewWebServiceStock service = new webservice.NewWebServiceStock();
        webservice.WebServiceStock port = service.getWebServiceStockPort();
        return port.listaProducto(sku);
    }

    public int varificarProducto(int numeroSalida) {
        webservice.NewWebServiceStock service = new webservice.NewWebServiceStock();
        webservice.WebServiceStock port = service.getWebServiceStockPort();
        return port.varificarProducto(numeroSalida);
    }
    
}
