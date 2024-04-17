**Activité Pratique N° 1- Injection des dépendances**  

  
1-Creation de d'interface IDao avec une méthode getDate
![1](https://github.com/BOULAHYA-Chaymae/TP1_Injection_des_dependances/assets/167257389/8126cf15-2fbf-469e-b3c4-2a07266f54a1)  

2. Creation d'une implémentation de l'interface IDao
![2](https://github.com/BOULAHYA-Chaymae/TP1_Injection_des_dependances/assets/167257389/c44b65ee-1311-4693-ac39-9f4925845e78)  

4. Creation d'interface IMetier avec une méthode calcul
![3](https://github.com/BOULAHYA-Chaymae/TP1_Injection_des_dependances/assets/167257389/6cc065ce-66a2-4def-9b4c-be07a09006e9)  

6. Création d'une implémentation de l'interface IMetier en utilisant le couplage faible
![4](https://github.com/BOULAHYA-Chaymae/TP1_Injection_des_dependances/assets/167257389/da130c20-36e0-4290-b92f-c74338c3a501)  


**5. l'injection des dépendances :**  

**a. Par instanciation statique**  
![instanciatin statique](https://github.com/BOULAHYA-Chaymae/TP1_Injection_des_dependances/assets/167257389/b35a74c7-10fe-4c9c-b9b9-b61ab5f286b3)  
**b. Par instanciation dynamique**

Pour l'instanciation dynamique, nous allons créer un fichier de configuration dans lequel nous déclarerons le nom de la classe que nous utiliserons dans la couche DAO, ainsi que le même processus pour la couche métier. L'application va lire le fichier config.txt pour créer des instances de la classe DAO et de la classe métier   
-Fichier config.txt  
![config tx](https://github.com/BOULAHYA-Chaymae/TP1_Injection_des_dependances/assets/167257389/bb5531a7-0497-41ab-a293-85be7ddccf75)  
-L'application pres2  
![class](https://github.com/BOULAHYA-Chaymae/TP1_Injection_des_dependances/assets/167257389/35873e26-d890-48c6-9672-c3e0ef7bf48b)  
 **c. En utilisant le Framework Spring**  
 -Version XML  
 ![xml](https://github.com/BOULAHYA-Chaymae/TP1_Injection_des_dependances/assets/167257389/5358e1f0-382e-4fa4-84c4-29d128ce3557)  
 - Version annotations
![annotation](https://github.com/BOULAHYA-Chaymae/TP1_Injection_des_dependances/assets/167257389/31769e33-ae24-4634-ae32-1f846bcd95d7)
 


