package trabajadores;

public class trabajadores {

    class empleado {
        String nombre;

        public empleado(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return "Empleado: " + nombre;
        }
    }
    class directivo extends empleado {
        public directivo(String nombre) {
            super(nombre);
        }

        @Override
        public String toString() {
            return "Directivo: " + nombre;
        }
    }

    class operario extends empleado {
        public operario(String nombre) {
            super(nombre);
        }

        @Override
        public String toString() {
            return "Operario: " + nombre;
        }
    }
    class oficial extends operario {
        public oficial(String nombre) {
            super(nombre);
        }

        @Override
        public String toString() {
            return "Oficial: " + nombre;
        }
    }
    class tecnico extends operario {
        public tecnico(String nombre) {
            super(nombre);
        }

        @Override
        public String toString() {
            return "Técnico: " + nombre;
        }
    }

    public static void main(String[] args) {
        trabajadores empresa = new trabajadores();

        empleado e1 = empresa.new empleado("Carlos");
        operario o1 = empresa.new operario("Luis");
        directivo d1 = empresa.new directivo("María");
        oficial of1 = empresa.new oficial("Ana");
        tecnico t1 = empresa.new tecnico("Pedro");

        System.out.println(e1);
        System.out.println(o1);
        System.out.println(d1);
        System.out.println(of1);
        System.out.println(t1);
    }
}