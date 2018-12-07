# Actions on Google: Actions SDK Sample using Java and App Engine

This sample shows how to create an app for the Google Assistant using the Actions SDK, Actions on Google's Java client library, and Google Cloud's App Engine.

## Setup Instructions

### Action configuration
1. Use the [Actions on Google Console](https://console.actions.google.com) to add a new project with a name of your choosing and click *Create Project*.
1. Scroll down and click *Actions SDK*.
1. [Install the gactions CLI](https://developers.google.com/actions/tools/gactions-cli) if you haven't already.
1. Deploy the fulfillment webhook as described in the *Webhook* section of this README.
1. Modify the `action.json` file included in the project, replacing the placeholder fulfillment URL with the URL to your fulfillment.
1. Run the command, adding in your project_id `gactions update --action_package action.json --project <YOUR_PROJECT_ID>`.
1. Go back to the [Actions on Google console](https://console.actions.google.com) and select the project that you have created for this sample.
1. On the left navigation menu under *TEST*, click on *Simulator*.
1. Type `Talk to my test app` in the simulator, or say `OK Google, talk to my test app` to any Actions on Google enabled device signed into your developer account.

For more detailed information on deployment, see the [documentation](https://developers.google.com/actions/dialogflow/deploy-fulfillment).

### Webhook
The sample includes entry points for both AWS Lambda and Google App Engine.

#### Build for Google Cloud Platform
    1. Delete ActionsAWSHandler.java
    1. Remove the following line from build.gradle:
       1. `apply from: 'build-aws.gradle'`
    1. Instructions for [Google Cloud App Engine Standard Environment](https://cloud.google.com/appengine/docs/standard/java/)
    1. Use gcloud CLI to set the project to the name of your Actions project. Use 'gcloud init' to initialize and set your Google cloud project to the name of the Actions project.
    1. Deploy to [App Engine using Gradle](https://cloud.google.com/appengine/docs/flexible/java/using-gradle) by running the following command: `gradle appengineDeploy`. You can do this directly from
    IntelliJ by opening the Gradle tray and running the appEngineDeploy task. This will start the process to deploy the fulfillment code to Google Cloud App Engine.

## References and How to report bugs
* Actions on Google documentation: [https://developers.google.com/actions/](https://developers.google.com/actions/).
* If you find any issues, please open a bug here on GitHub.
* Questions are answered on [StackOverflow](https://stackoverflow.com/questions/tagged/actions-on-google).

## How to make contributions?
Please read and follow the steps in the [CONTRIBUTING.md](CONTRIBUTING.md).

## License
See [LICENSE](LICENSE).

## Terms
Your use of this sample is subject to, and by using or downloading the sample files you agree to comply with, the [Google APIs Terms of Service](https://developers.google.com/terms/).

## Google+
Actions on Google Developers Community on Google+ [https://g.co/actionsdev](https://g.co/actionsdev).
