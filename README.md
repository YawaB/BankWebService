# BankWebService

# MAWUVIWO Yawa Brinda

Cette repository Git abrite un Web service qui permet de convertir l'euro en DH, de consulter des comptes individuels et
d'accéder à des listes de comptes. Déployé sur un serveur JAX-WS, le service a été testé avec l'outil SoapUI et un
client SOAP en Java a été créé.Le service a été intégré dans un projet Spring Boot.
<h1>Demarrage du service de banque</h1>

<img src="./captures/demarrageServer.png">
<h3>Visualisation du WSDL</h3>
<img src="./captures/wsdl.png">
<p>le lien http://localhost:9191/?wsdl affiche le wsdl de ce service sans specifier son nom car il est le seul service démarré</p>
<h5>Les différentes méthodes du service BanqueWS</h5>
<img src="./captures/operationsBanqueWS.png">
<h1>Utilisation de SoapUI pour tester le Webservice</h1>
<img src="./captures/newSoapProject.png">
<p>Nous donnons un nom au projet SOAP et le lien vers le wsdl</p>
<p>Le projet charge effectivement les operations du webservice disponibles sur le wsdl</p>
<img src="./captures/soapOperations.png">
<h5>Test de la methode Conversion</h5>
<img src="./captures/requestConvert.png">
<p>Nous envoyons une requete en format XML et recevons une reponse en ce meme format. La conversion 100 Euro donne 1100 Dhs.</p>
<h5>Test de la methode getCompte</h5>
<img src="./captures/requestGetCompte.png">
<p>Nous envoyons une requete en format XML pour recuperer le compte d'identifiant 1 et recevons une reponse en ce meme format nous donnant son id et le montant</p>
<h5>Test de la methode listCompte</h5>
<img src="./captures/requestListCompte.png">
<p>Nous envoyons une requete en format XML pour recuperer tous les comptes crées et recevons une reponse en ce meme format nous donnant les id et les montants de chaque compte</p>

<h1>Création du projet Client SOAP Java</h1>
<img src="./captures/clientWS.png">
<p>Le client SOAP Java est une classe Java exécutant un ensemble de fonctions disponibles sur notre service</p>
<h5>Génération d'un Proxy à partir du wsdl</h5>
<img src="./captures/generationClassesFromWSDL.png">
<p>Le proxy est un ensemble de classes java permettant au client de communiquer avec le webservice</p>
<h6>Création du middleware Stub</h6>
<img src="./captures/middlewareStub.png">
<p>Stub est le middleware. A chaque fois que l'on veut appeler une fonction du webservice, il faut passer par stub</p>
<h5>Utilisation du stub pour communiquer avec le webservice</h5>
<img src="./captures/methode.png">
<p>Nous avons exécuter les méthodes getCompte, getCode et getMontant</p>
<h4>Exécution réussie</h4>
<img src="./captures/testClient.png">
<p>Le client arrive à communiquer avec le Webservice</p>

