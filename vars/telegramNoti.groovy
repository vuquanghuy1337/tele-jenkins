#! /bin/bash
API = 'bot5700617525:AAGXbkqZ2psOplICMFSWVhggYM2ySrNtgeQ'
chatID = '-678535988'
bell = '\ud83d\udd14'
verify = '\u2714'

def call(String API, String chatID, String bell, String verify){
	sh """ #! /bin/bash
	curl -X POST \
	-H 'Content-Type: application/json' \
	-d '{"text": "Job \\"${JOB_NAME}\\" has status ${currentBuild.result}, Build ID is ${BUILD_ID} \n\n View log in [${bell}]($BUILD_URL/console)", "parse_mode": "markdown" , "chat_id": '$chatID'}' \ 
	https://api.telegram.org/$API/sendMessage 
	"""
}
