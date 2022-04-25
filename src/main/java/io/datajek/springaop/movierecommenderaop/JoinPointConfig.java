package io.datajek.springaop.movierecommenderaop;

import org.aspectj.lang.annotation.Pointcut;

public class JoinPointConfig {
    @Pointcut("execution(* io.datajek.springaop.movierecommenderaop.*.*(..))")
    public void dataLayerPointcut() {}

    @Pointcut("execution(* io.datajek.springaop.movierecommenderaop.*.*(..))")
    public void businessLayerPointcut() {}

    //to intercept method calls for both layers:
    @Pointcut("io.datajek.springaop.movierecommenderaop.JoinPointConfig.dataLayerPointcut() || "
            + "io.datajek.springaop.movierecommenderaop.JoinPointConfig.businessLayerPointcut()")
    public void allLayersPointcut() {}

    //for a particular bean
    @Pointcut("bean(movie*)")
    public void movieBeanPointcut() {}

    @Pointcut("@annotation(io.datajek.springaop.movierecommenderaop.MeasureTime)")
    public void measureTimeAnnotation() {}
}
