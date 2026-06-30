//package pdf;
//import org.apache.pdfbox.pdmodel.PDDocument;
//import org.apache.pdfbox.pdmodel.PDPage;
//import org.apache.pdfbox.pdmodel.PDPageContentStream;
//import org.apache.pdfbox.pdmodel.font.PDType1Font;
//
//import java.io.IOException;
//public class test {
//
//	    public static void main(String[] args) {
//	        try (PDDocument document = new PDDocument()) {
//	            PDPage page = new PDPage();
//	            document.addPage(page);
//
//	            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
//	                // Set up fonts and margins
//	                PDType1Font fontBold = PDType1Font.HELVETICA_BOLD;
//	                PDType1Font fontRegular = PDType1Font.HELVETICA;
//	                float margin = 50;
//	                float yPosition = 700;
//	                float leading = 14;
//
//	                // Add title
//	                contentStream.setFont(fontBold, 18);
//	                contentStream.beginText();
//	                contentStream.newLineAtOffset(margin, yPosition);
//	                contentStream.showText("4-Week Sciatica-Friendly Workout Plan");
//	                contentStream.endText();
//	                yPosition -= 30;
//
//	                // Add workout plan content
//	                String workoutPlan = """
//	                    ### Key Rules for Sciatica Safety
//	                    - 🚫 Avoid: Forward bending, twisting, heavy weights
//	                    - ✅ Do: Slow movements, light resistance bands
//	                    - 💡 Pain Management: Ice/heat therapy
//	                    
//	                    ### Weekly Schedule
//	                    - Days 1,2,4,5: Workout
//	                    - Days 3,6-7: Recovery
//	                    
//	                    ### Week 1: Foundation Phase
//	                    Day 1 – Lower Body + Cardio
//	                    1. Warm-Up: 5-min seated marching
//	                    2. Glute Bridges: 3 sets × 12 reps
//	                    3. Standing Clamshells: 2 × 15/side
//	                    ... (add full workout text here) ...
//	                    """;
//
//	                contentStream.setFont(fontRegular, 12);
//	                String[] lines = workoutPlan.split("\n");
//	                
//	                for (String line : lines) {
//	                    if (line.startsWith("###")) {
//	                        // Section heading
//	                        contentStream.setFont(fontBold, 14);
//	                        contentStream.beginText();
//	                        contentStream.newLineAtOffset(margin, yPosition);
//	                        contentStream.showText(line.substring(4).trim());
//	                        contentStream.endText();
//	                        yPosition -= leading + 4;
//	                        contentStream.setFont(fontRegular, 12);
//	                    } else {
//	                        // Regular text
//	                        addWrappedText(contentStream, margin, yPosition, 500, line, fontRegular, 12);
//	                        yPosition -= leading;
//	                    }
//	                    
//	                    if (yPosition < 50) {
//	                        contentStream.close();
//	                        page = new PDPage();
//	                        document.addPage(page);
//	                        contentStream = new PDPageContentStream(document, page);
//	                        yPosition = 700;
//	                    }
//	                }
//
//	            } catch (IOException e) {
//	                e.printStackTrace();
//	            }
//
//	            // Save the PDF
//	            document.save("WorkoutPlan.pdf");
//	            System.out.println("PDF created successfully!");
//
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//	    }
//
//	    private static void addWrappedText(PDPageContentStream contentStream, float x, float y, 
//	                                      float maxWidth, String text, PDType1Font font, float fontSize) 
//	                                      throws IOException {
//	        contentStream.setFont(font, fontSize);
//	        String[] words = text.split(" ");
//	        StringBuilder line = new StringBuilder();
//
//	        for (String word : words) {
//	            if (getStringWidth(line + " " + word, font, fontSize) < maxWidth) {
//	                line.append(word).append(" ");
//	            } else {
//	                contentStream.beginText();
//	                contentStream.newLineAtOffset(x, y);
//	                contentStream.showText(line.toString());
//	                contentStream.endText();
//	                y -= 14;
//	                line = new StringBuilder(word).append(" ");
//	            }
//	        }
//	        // Add remaining text
//	        contentStream.beginText();
//	        contentStream.newLineAtOffset(x, y);
//	        contentStream.showText(line.toString());
//	        contentStream.endText();
//	    }
//
//	    private static float getStringWidth(String text, PDType1Font font, float fontSize) {
//	        return font.getStringWidth(text) / 1000 * fontSize;
//	    }
//	}
