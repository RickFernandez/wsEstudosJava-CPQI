package refinado;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) //Restringe a anotação somente para Classes
@Documented //Faz com que a anotação seja documentada
public @interface Cabecalho {

	String intituicao();
	String projeto();
	String dataCriacao();
	String criador();
	int revisao() default 1;
}
