package Annotations0717;

import java.lang.annotation.Documented;

@Documented
public @interface Annotations {
	String author();
	String date();
	int currentRevision() default 1;
	String lastModified() default "N/A";
	String lastModifiedBy() default "N/A";
	// Note use of array
	String[] reviewers();
}
