package refinado;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD}) //Restringe a anotação para Classes e Métodos
@Documented
public @interface errosRCorrigidos {

	String[] erros();
}
