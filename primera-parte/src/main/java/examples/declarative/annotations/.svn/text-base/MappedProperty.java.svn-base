package examples.declarative.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import examples.declarative.base.PropertyConverter;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MappedProperty {

	public String column();

	public Class<? extends PropertyConverter> converter();

}
