package entradaBlogJAM;

/**
 * Clase para manejar las entradas de un blog.
 * Modificar.
 * @author Ana López.
 * @version 2.3
 * @since 21/3/1999
 */
public class EntradaBlogJAM {
        /**
         * separador es el carácter que separa ENTRADA DE del
         * @author Jesús Ayala
         */
        public static char separador=':';
        private int id;
        private String texto;
        private String autor;

        /**
         * Constructor de la clase recibe el número de entrada, el nombre del autor
         * de la entrada y el texto que contiene la entrada. Si el número de entrada
         * @param id
         * @param autor
         * @param texto
         * @throws IllegalArgumentException
         */
        public EntradaBlogJAM(int id,String autor,String texto)throws IllegalArgumentException{
                if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
                this.id=id;
                this.autor=autor;
                this.texto=texto;
        }
        @Override
        public String toString(){
                String cad="";
                cad+="\nENTRADA DE"+separador+autor;
                cad+="\n "+texto;
                return cad;
        }

        /**
         * Devuelve el número de la entrada
         * @return
         */
        public int getId(){
                return this.id;
        }

        /**
         * Devuelve el texto completo de la entrada
         * @return
         */
        public String getTexto(){
                return this.texto;
        }

        /**
         * Devuelve el nombre del autor de la entrada en mayúsculas
         * @return
         */
        public String getAutor(){
                return this.autor.toUpperCase();
        }

        /**
         * Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
         * @return
         */
        public String devuelveAutor(){
                return this.autor;
        }

        /**
         * No tiene por qué tener argumentos.
         * @param args
         */
        public static void main(String[] args) {
                /**
                 * Modificar.
                 */
                EntradaBlogJAM e1=new EntradaBlogJAM (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
                System.out.println(e1);
        }
}
