#!/usr/bin/env groovy

def call(String API, String chatID, String bell){
	sh """ #! /bin/bash
	curl -X POST https://api.telegram.org/bot5700617525:AAGXbkqZ2psOplICMFSWVhggYM2ySrNtgeQ/sendMessage \
	-H 'Content-Type: application/json' \
	-d '{"text": "Job \\"${JOB_NAME}\\" has status ${currentBuild.currentResult}, Build ID is ${BUILD_ID} \n\n View log in [🔔]($BUILD_URL/console)", "parse_mode": "markdown" , "chat_id": '-678535988'}'  
	"""
}
