Browser Stack integration steps

Sample request for uploading the App with custom ID
curl -u "ahmedmadyan_oxTGNa:efFbRGj4yaxcVuPxyJKs" -X POST "https://api-cloud.browserstack.com/app-automate/upload" -F "file=@C:\Users\_VOIS\Documents\Mobile Applications\iOS\UIKitCatalog.ipa" -F "custom_id=UIKitCatalog"

Sample response
{"app_url":"bs://05408a5efbe298daa8c50692ab1830eaeb0050a3","custom_id":"UIKitCatalog","shareable_id":"ahmedmadyan_oxTGNa/UIKitCatalog"}

Sample request for deleting the App
curl -u "ahmedmadyan_oxTGNa:efFbRGj4yaxcVuPxyJKs" -X DELETE "https://api-cloud.browserstack.com/app-automate/app/delete/1824c7990fe34023bdd4e19715f15873e71ea265"


API request to retrieve details about your recent app uploads.
curl -u "ahmedmadyan_oxTGNa:efFbRGj4yaxcVuPxyJKs" -X GET https://api-cloud.browserstack.com/app-automate/recent_apps