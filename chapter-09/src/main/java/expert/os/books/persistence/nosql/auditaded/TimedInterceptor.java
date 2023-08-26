package expert.os.books.persistence.nosql.auditaded;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import java.util.logging.Logger;

@Timed
@Interceptor
@Priority(Interceptor.Priority.APPLICATION)
public class TimedInterceptor {

    private static final Logger LOGGER = Logger.getLogger(TimedInterceptor.class.getName());

    @AroundInvoke
    public Object auditMethod(InvocationContext ctx) throws Exception {
        long start = System.currentTimeMillis();
        Object result = ctx.proceed();
        long end = System.currentTimeMillis() - start;
        String message = String.format("Time to execute the class %s, the method %s is of %d milliseconds",
                ctx.getTarget().getClass(), ctx.getMethod(), end);
        LOGGER.info(message);
        return result;
    }
}
