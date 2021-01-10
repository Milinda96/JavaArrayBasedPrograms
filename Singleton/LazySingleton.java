// package Singleton;

// public class LazySingleton {
//     private static LazySingleton lSingleton;
//     private LazySingleton() {}

//     public static LazySingleton gSingleton() {
//         if (lSingleton == null) {
//             synchronized(SingletonAccess.class) {
//                 if (lSingleton == null) {
//                     lSingleton = new SingletonAccess();
//                 }
//             }
//         }
//         return lSingleton;
//     }
// }
