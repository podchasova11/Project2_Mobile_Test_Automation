package articlesTests.avaxPricePrediction;

import abstractSetting.AbstractTest;
import examples.pageElements.AvaxPricePredictionElements;
import examples.utils.MyUtils;
import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class BlockchainLinkTest extends AbstractTest {
//    static Logger logger = LoggerFactory.getLogger(BlockchainLinkTest.class);
//
//    @Epic("Articles")
//    @Feature("Avax price prediction: Will Avalanche fall further?")
//    @DisplayName("Test№3")
//    @Severity(SeverityLevel.CRITICAL)
//    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
//    @Test
//    void blockchainLinkTest() throws IOException {
//        try {
//            AvaxPricePredictionElements tapElement = new AvaxPricePredictionElements(getAndroidDriver());
//            tapElement.goToArticles();
//            Thread.sleep(2000);
//            tapElement.tapAvaxPricePrediction();
//            Thread.sleep(2000);
//            tapElement.tapBlockchain();
//            getAndroidDriver().context("WEBVIEW_chrome");
//            getAndroidDriver().getWindowHandle();
//        } catch (Exception e) {
//            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (AVAX price prediction) BlockchainLinkTest- False" + System.currentTimeMillis() + ".png");
//            Allure.addAttachment("Screenshot", new ByteArrayInputStream(MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()))));
//            logger.error("org.example.articlesTests (AVAX price prediction) BlockchainLinkTest- False");
//        }
//        Assertions.assertTrue(getAndroidDriver().getTitle().equals("What is a blockchain technology | How do blockchains work? | Capital.com"));
//        Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/blockchain-technology-definition"));
//        logger.info("(AVAX price prediction) BlockchainLinkTest- passed");
//    }
}
