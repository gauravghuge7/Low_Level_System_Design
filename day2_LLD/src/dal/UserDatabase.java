

package dal;


public class UserDatabase {

        private static UserDatabase instance;


        private UserDatabase() {
            // make the constructor private

        }


        public static synchronized UserDatabase getInstance() {
                if(instance == null) {
                        instance = new UserDatabase();
                }

                return instance;
        }

}