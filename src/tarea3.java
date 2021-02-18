public class tarea3 {

    public static class Person{
        int ed;
        private String nombre;

        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public int getEdad(){
            return ed;
        }
        public void CumplirA(){
            this.ed ++;
        }
    }

    public static class Main {
        public void main(String[] args) {
            Person Juan = new Person();
            Person Pepe = new Person();

            Juan.setNombre("Juan");
            Pepe.setNombre("Pepe");

            for(int i=0; i<4; i++){
                Juan.CumplirA();
            }
            for(int j=0; j<2;j++){
                Pepe.CumplirA();
            }

            System.out.println(Juan.getNombre() + "tiene" + Juan.getEdad() + "años");
            System.out.println(Pepe.getNombre() + "tiene" + Pepe.getEdad() + "años");
        }
    }
}
