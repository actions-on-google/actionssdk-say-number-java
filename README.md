# Actions on Google: Actions SDK Sample using Java and App Engine

This sample shows how to create an app for the Google Assistant using the Actions SDK, Actions on Google's Java client library, and Google Cloud's App Engine.

## Setup Instructions

### Action configuration
1. From the [Actions on Google Console](https://console.actions.google.com/), add a new project (this will become your *Project ID*) > **Create Project**.
1. Scroll down and click **Actions SDK**.
1. [Install the gactions CLI](https://developers.google.com/actions/tools/gactions-cli) if you haven't already.

#### App Engine Deployment & Webhook Configuration
When a new project is created using the Actions Console, it also creates a Google Cloud project in the background.

1. Download & install the [Google Cloud SDK](https://cloud.google.com/sdk/docs/)
1. Configure the gcloud CLI and set your Google Cloud project to the name of your Actions on Google Project ID, which you can find from the [Actions on Google console](https://console.actions.google.com/) under Settings ⚙
   + `gcloud init`
   + `gcloud auth application-default login`
   + `gcloud components install app-engine-java`
   + `gcloud components update`
1. Deploy to [App Engine using Gradle](https://cloud.google.com/appengine/docs/flexible/java/using-gradle):
   + `gradle appengineDeploy` OR
   +  From within IntelliJ, open the Gradle tray and run the appEngineDeploy task.
1. Modify the `action.json` file included in the project, replacing the placeholder fulfillment URL with the URL to your fulfillment.
1. Run the command, adding in your project_id `gactions update --action_package action.json --project <YOUR_PROJECT_ID>`.

#### Testing this Sample
1. In the [Actions on Google console](https://console.actions.google.com), select the project that you have created for this sample.
1. On the left navigation menu under **TEST**, click on **Simulator**.
1. Type `Talk to my test app` in the simulator, or say `OK Google, talk to my test app` to Google Assistant on a mobile device associated with your Action's account.

### References & Issues
+ Questions? Go to [StackOverflow](https://stackoverflow.com/questions/tagged/actions-on-google), [Actions on Google G+ Developer Community](https://g.co/actionsdev), or [Support](https://developers.google.com/actions/support/).
+ For bugs, please report an issue on Github.
+ For Actions on Google [documentation](https://developers.google.com/actions/).
+ For specifics about [Gradle & the App Engine Plugin](https://cloud.google.com/appengine/docs/flexible/java/using-gradle)
+ For details on deploying [Java apps with App Engine](https://cloud.google.com/appengine/docs/standard/java/quickstart)

### Make Contributions
Please read and follow the steps in the [CONTRIBUTING.md](CONTRIBUTING.md).

### License
See [LICENSE](LICENSE).

### Terms
Your use of this sample is subject to, and by using or downloading the sample files you agree to comply with, the [Google APIs Terms of Service](https://developers.google.com/terms/).
