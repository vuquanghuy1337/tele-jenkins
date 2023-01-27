#!/usr/bin/env groovy

def call(String API, String chatID, String bell){
	sh """ #! /bin/bash
	curl -X POST https://api.telegram.org/$API/sendMessage \
	-H 'Content-Type: application/json' \
	-d '{"text": "Job \\"${JOB_NAME}\\" has status ${currentBuild.currentResult}, Build ID is ${BUILD_ID} \n\n View log in [${bell}]($BUILD_URL/console)", "parse_mode": "markdown" , "chat_id": '$chatID'}'  
	"""
}
