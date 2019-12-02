package com.in28minutes.multithreading;

//extends Thread
//implements Runnable


class Task1 extends Thread {
	@Override
	public void run() { // SIGNATURE
		System.out.print("\nTask1 Started");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask1 Done");

	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("\nTask2 Started ");

		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}


		System.out.print("\nTask2 Done");
	}

}
public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Task1 Kicked Off Task2 Kicked Off Task1 Started101 102 103 104 105 106 107
		 * 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122 123 124 125 126
		 * 127 128 129 130 131 132 133 134 135 136 137 138 139 140 141 142 143 144 145
		 * 146 147 148 149 150 151 152 153 154 155 156 157 158 159 160 161 162 163 164
		 * 165 166 167 168 169 170 171 172 173 174 175 176 177 178 179 180 181 182 183
		 * 184 185 186 187 188 189 190 191 192 193 194 195 196 197 198 199 Task1 Done
		 * Task3 Kicked Off301 302 303 304 305 306 307 308 309 310 311 312 313 314 315
		 * 316 317 318 319 320 321 322 323 324 325 326 327 328 329 330 331 332 333 334
		 * 335 336 337 338 339 340 341 342 343 344 345 346 347 348 349 350 351 352 353
		 * 354 355 356 357 358 359 360 361 362 363 364 365 366 367 368 369 370 371 372
		 * 373 374 Task2 Started 375 376 377 378 379 380 201 381 202 203 204 205 206 207
		 * 382 383 384 385 386 387 388 389 390 391 392 393 394 395 396 397 398 399 Task3
		 * Done208 209 210 211 212 213 214 215 216 217 218 219 220 221 222 223 224 225
		 * 226 227 228 229 230 231 232 233 234 235 236 237 238 239 240 241 242 243 244
		 * 245 246 247 248 249 250 251 252 253 254 255 256 257 258 259 260 261 262 263
		 * 264 265 266 267 268 269 270 271 272 273 274 275 276 277 278 279 280 281 282
		 * 283 284 285 286 287 288 289 290 291 292 293 294 295 296 297 298 299 Task2
		 * Done Main Done
		 */
		// NEW;
		// RUNNABLE;
		// RUNNING;
		// BlOCKED/WAITING;
		// TERMINATED/DEAD;

		// Task1
		System.out.print("\nTask1 Kicked Off");
		Task1 task1 = new Task1();
		task1.start(); // task1.run();

		System.out.print("\nTask2 Kicked Off");
		// Task2
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

		// wait for task1 to complete
		task1.join();
		task2Thread.join();

		// Task3
		System.out.print("\nTask3 Kicked Off");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask3 Done");
		System.out.print("\nMain Done");

	}

}
