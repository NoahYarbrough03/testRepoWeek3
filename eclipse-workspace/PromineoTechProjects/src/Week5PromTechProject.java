
public class Week5PromTechProject {


		public static void main(String[] args) {
		    Logger asteriskLogger = new AsteriskLogger();
		    Logger spacedLogger = new SpacedLogger();

		    // Testing AsteriskLogger
		    asteriskLogger.log("Noah");
		    asteriskLogger.error("You're not Noah!");

		    // Testing SpacedLogger
		    spacedLogger.log("Noah");
		    spacedLogger.error("You're not Noah!");
		}

		interface Logger {
		    void log(String message);
		    void error(String message);
		}

		static class AsteriskLogger implements Logger {
		    @Override
		    public void log(String message) {
		        System.out.println("***" + message + "***");
		    }

		    @Override
		    public void error(String message) {
		        System.out.println("****************");
		        System.out.println("***Error: " + message + "***");
		        System.out.println("****************");
		    }
		}

		static class SpacedLogger implements Logger {
		    @Override
		    public void log(String message) {
		        StringBuilder spacedMessage = new StringBuilder();
		        for (char c : message.toCharArray()) {
		            spacedMessage.append(c).append(' ');
		        }
		        System.out.println(spacedMessage.toString());
		    }

		    @Override
	        public void error(String message) {
	            StringBuilder spacedErrorMessage = new StringBuilder("ERROR: ");
	            for (char c : message.toCharArray()) {
	                spacedErrorMessage.append(c).append(' ');
	            }
	            System.out.println(spacedErrorMessage.toString());
	        }
	    }
	}