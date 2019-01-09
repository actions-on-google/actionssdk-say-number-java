/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example;

import com.google.actions.api.ActionRequest;
import com.google.actions.api.ActionResponse;
import com.google.actions.api.ActionsSdkApp;
import com.google.actions.api.ForIntent;
import com.google.actions.api.response.ResponseBuilder;
import java.text.MessageFormat;
import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Libraries for Google Assistant SDK

public class SayNumberApp extends ActionsSdkApp {

  private static final Logger LOGGER = LoggerFactory
      .getLogger(SayNumberApp.class);

  // Note: Do not store any state as an instance variable.
  // It is ok to have final variables where the variable is assigned a value in
  // the constructor but remains unchanged. This is required to ensure thread-
  // safety as the entry point (ActionServlet) instances may
  // be reused by the server.

  @ForIntent("actions.intent.MAIN")
  public ActionResponse welcome(ActionRequest request) {
    LOGGER.info("Welcome intent start.");
    ResponseBuilder responseBuilder = getResponseBuilder(request);
    ResourceBundle rb = ResourceBundle.getBundle("resources",
        request.getLocale());
    responseBuilder.add(rb.getString("welcome"));

    LOGGER.info("Welcome intent end.");
    return responseBuilder.build();
  }

  @ForIntent("actions.intent.TEXT")
  public ActionResponse number(ActionRequest request) {
    LOGGER.info("Number intent start.");
    ResponseBuilder responseBuilder = getResponseBuilder(request);
    ResourceBundle rb = ResourceBundle.getBundle("resources");

    String userNumber = request.getArgument("text").getTextValue();
    String response;
    if (userNumber.equals("bye")) {
      response = rb.getString("bye");
      responseBuilder.add(response).endConversation();
    } else {
      response = MessageFormat.format(rb.getString("sayOrdinal"), userNumber);
      responseBuilder.add(response);
    }
    LOGGER.info("Number intent end.");
    return responseBuilder.build();
  }


}
