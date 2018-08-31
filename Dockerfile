FROM projectriff/java-function-invoker:0.0.5-snapshot
ARG FUNCTION_JAR=/functions/mandelbrot-0.0.1-SNAPSHOT.jar
ARG FUNCTION_CLASS=be.ordina.function.MandelbrotFunction
ADD target/mandelbrot-0.0.1-SNAPSHOT.jar $FUNCTION_JAR
ENV FUNCTION_URI file://${FUNCTION_JAR}?handler=${FUNCTION_CLASS}
