package cuentas;

public class Main {
//*modifico el codigo para el Commit descrptivo*/
    public static void main(String[] args) {
        //* Creamos una cuenta*/
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        
        //* Llamamos al nuevo método con el parámetro cantidad */
        operativa_cuenta(cuenta1, 2300);   //* Se pasa la cantidad de 2300 */
    }

    //* Modificado: Ahora el método acepta un parámetro cantidad de tipo float */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual = cuenta1.estado();   //* Consultamos saldo */
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(cantidad);   //* Intentamos retirar la cantidad especificada */
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);   //* Intentamos ingresar la misma cantidad */
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
