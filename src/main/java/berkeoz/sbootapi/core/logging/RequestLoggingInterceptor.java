package berkeoz.sbootapi.core.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class RequestLoggingInterceptor implements HandlerInterceptor {
	private static final Logger logger = LoggerFactory.getLogger(RequestLoggingInterceptor.class);
	private static final ThreadLocal<Long> startTime = new ThreadLocal<>();

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		startTime.set(System.currentTimeMillis());
		logger.info("Request [{} {}] from IP: {}", request.getMethod(), request.getRequestURI(),
				request.getRemoteAddr());

		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		long duration = System.currentTimeMillis() - startTime.get();
		startTime.remove();
		logger.info("Response [{} {}] Status: {} | Time Taken: {}ms", request.getMethod(), request.getRequestURI(),
				response.getStatus(), duration);
	}
}
