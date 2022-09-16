#!/usr/bin/env groovy
def call(String botToken, String chatID) {
            sh """ #!/bin/bash 
            curl -s -X POST https://api.telegram.org/bot${botToken}/sendMessage -d chat_id=${chatID} -d text="Build status is "${currentBuild.result}" "
            """
}
