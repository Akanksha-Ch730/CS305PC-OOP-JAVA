import java.lang.Annotation.*;
@Target(ElementType.Type)
@Retention(RetentionPolicy.RUNTIME)

@interface MyAnno{
	String usage()default"dip dip dip";
}
