# Actions on Google: Actions SDK SSML Sample

*:warning: Warning: Conversational Actions will be deprecated on June 13, 2023. For more information,
see [Conversational Actions Sunset](https://goo.gle/ca-sunset).*

:warning: This code sample was built using the legacy Actions SDK. We now recommend using [Actions Builder or the new Actions SDK](https://developers.google.com/assistant/conversational/overview) to develop, test, and deploy Conversational Actions.

This sample shows how to create an Action for the Google Assistant using the [Actions SDK](https://developers.google.com/assistant/actions/actions-sdk/),
the Actions on Google [Java client library](https://github.com/actions-on-google/actions-on-google-java), and
Google Cloud [App Engine](https://cloud.google.com/appengine/docs/standard/java/quickstart).

## Setup Instructions

### Prerequisites
1. Download & install the [Google Cloud SDK](https://cloud.google.com/sdk/docs/)
1. [Gradle with App Engine Plugin](https://cloud.google.com/appengine/docs/flexible/java/using-gradle)
    + Run `gcloud auth application-default login` with your Gooogle account
    + Install and update the App Engine component,`gcloud components install app-engine-java`
    + Update other components, `gcloud components update`
1.  [Install the gactions CLI](https://developers.google.com/assistant/tools/gactions-cli)
    + You may need to grant execute permission, ‘chmod +x ./gactions’

### Configuration

#### Action Console
1. From the [Actions on Google Console](https://console.actions.google.com/), New project (this will become your *Project ID*) > **Create project**.
1. Scroll down > under **More options** select **Actions SDK** > keep **Use Actions SDK to add Actions** modal open
1. [Install the gactions CLI](https://developers.google.com/assistant/tools/gactions-cli) if you haven't already.

#### App Engine Deployment & Webhook Configuration
When a new project is created using the Actions Console, it also creates a Google Cloud project in the background.

1. Configure the gcloud CLI and set your Google Cloud project to the name of your Actions on Google Project ID, which you can find from the [Actions on Google console](https://console.actions.google.com/) under Settings ⚙
   + `gcloud init`

1. Deploy to [App Engine using Gradle](https://cloud.google.com/appengine/docs/flexible/java/using-gradle):
   + `gradle appengineDeploy` OR
   +  From within IntelliJ, open the Gradle tray and run the appEngineDeploy task
1. Open the `action.json` file:
   + In the **conversations object** > replace the placeholder **URL** values with `https://<YOUR_PROJECT_ID>.appspot.com`
1. In terminal, run `gactions update --action_package action.json --project <YOUR_PROJECT_ID>`

1. Back in the [Actions console](https://console.actions.google.com), from the **Use Actions SDK to add Actions** window > select **OK**.
1. From the top menu click **Test** to open the Actions on Google simulator then say or type `Talk to my test app`.

### Running this Sample
+ You can test your Action on any Google Assistant-enabled device on which the Assistant is signed into the same account used to create this project. Just say or type, “OK Google, talk to my test app”.
+ You can also use the Actions on Google Console simulator to test most features and preview on-device behavior.

### References & Issues
+ Questions? Go to [StackOverflow](https://stackoverflow.com/questions/tagged/actions-on-google), [Assistant Developer Community on Reddit](https://www.reddit.com/r/GoogleAssistantDev/) or [Support](https://developers.google.com/assistant/support).
+ For bugs, please report an issue on Github.
+ Actions on Google [Documentation](https://developers.google.com/assistant).
+ Getting started with [Actions SDK Guide](https://developers.google.com/assistant/actions/actions-sdk/).
+ More info about [Gradle & the App Engine Plugin](https://cloud.google.com/appengine/docs/flexible/java/using-gradle).
+ More info about deploying [Java apps with App Engine](https://cloud.google.com/appengine/docs/standard/java/quickstart).

### Make Contributions
Please read and follow the steps in the [CONTRIBUTING.md](CONTRIBUTING.md).

### License
See [LICENSE](LICENSE).

### Terms
Your use of this sample is subject to, and by using or downloading the sample files you agree to comply with, the [Google APIs Terms of Service](https://developers.google.com/terms/).
