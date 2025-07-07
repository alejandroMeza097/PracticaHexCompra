package mx.com.santander.hexagonalmodularmaven.producto.model.exception;

public class ProductoException extends RuntimeException {

    private String errMessage;

    public ProductoException(){

    }

    public ProductoException(String errMessage){
        this.errMessage = errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
    
}
