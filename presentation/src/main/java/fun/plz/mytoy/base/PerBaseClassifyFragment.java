package fun.plz.mytoy.base;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by PLZ on 2017/1/9.
 */
@Scope
@Retention(RUNTIME)
public @interface PerBaseClassifyFragment {
}
